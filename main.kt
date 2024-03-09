import java.io.File

fun main() {
    val filePath = "your_file_path.txt"

    try {
        // Read the content of the file
        val fileContent = File(filePath).readText()
        
        // Print the content of the file to the console
        println(fileContent)
    } catch (e: Exception) {
        // Handle any errors that occur during file reading
        println("An error occurred: ${e.message}")
    }

    // Wait for user input before exiting the program
    println("Press Enter to exit")
    readLine()
}
