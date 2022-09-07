package SystemPrograms

import java.io.BufferedReader
import java.io.File
import java.io.FileWriter
import java.io.InputStreamReader


/**
 * Method for get System Motherboard Serial Number
 * @return  MAC Address
 */
fun getSystemMotherBoardSerialNumber(): String? {
    return try {
        val osName = System.getProperty("os.name")
        osName.contains("Windows")
        getWindowsMotherboardSerialNumber()
    } catch (E: Exception) {
        System.err.println("System MotherBoard Exp : " + E.message)
        null
    }
}

/**
 * Function for get Windows Machine MotherBoard Serial Number
 */
fun getWindowsMotherboardSerialNumber(): String? {
    var result = ""
    try {
        val file = File.createTempFile("realhowto", ".vbs")
        file.deleteOnExit()
        val fw = FileWriter(file)
        val vbs = """Set objWMIService = GetObject("winmgmts:\\.\root\cimv2")
Set colItems = objWMIService.ExecQuery _ 
   ("Select * from Win32_BaseBoard") 
For Each objItem in colItems 
    Wscript.Echo objItem.SerialNumber 
    exit for  ' do the first cpu only! 
Next 
"""
        fw.write(vbs)
        fw.close()
        val p = Runtime.getRuntime().exec("cscript //NoLogo " + file.path)
        val input = BufferedReader(InputStreamReader(p.inputStream))
        var line: String?
        while (input.readLine().also { line = it } != null) {
            result += line
        }
        input.close()
    } catch (E: Exception) {
        System.err.println("Windows MotherBoard Exp : " + E.message)
    }
    return result.trim { it <= ' ' }
}

fun main(args: Array<String>) {

    //Call Function To get MotherBoard Serial Number
    val motherboardSerialnumber = getSystemMotherBoardSerialNumber()

    // Print Mother Board Serial Number
    println("MotherBoard Serial Number : $motherboardSerialnumber")
}