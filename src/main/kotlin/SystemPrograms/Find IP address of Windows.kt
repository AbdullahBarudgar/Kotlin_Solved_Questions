package SystemPrograms

import java.net.Inet4Address
import java.net.InetAddress
import java.net.NetworkInterface

//Function to Find out IP Address

fun getSystemIP(): String? {
    return try {
        var sysIP: String?
        val osName = System.getProperty("os.name")
        osName.contains("Windows")
        sysIP = InetAddress.getLocalHost().hostAddress

        sysIP
    } catch (E: Exception) {
        System.err.println("System IP Exp : " + E.message)
        null
    }
}
fun main(args : Array<String>){


    //Call Function to get IP Address
    val ipAddress = getSystemIP()

    //Print IP Address
    println("System IP : $ipAddress")

}