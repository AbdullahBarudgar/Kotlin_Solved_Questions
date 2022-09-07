package SystemPrograms

import java.net.InetAddress


/**
 * Function for System Name
 */
fun getSystemName(): String? {
    return try {
        InetAddress.getLocalHost().hostName
    } catch (E: Exception) {
        System.err.println("System Name Exp : " + E.message)
        null
    }
}

//Main function , Program Entry Point
fun main(args: Array<String>) {

    // Call Function to get Computer System Name
    val systemName = getSystemName()

    // Print Computer Name
    println("Computer Name : $systemName")
}