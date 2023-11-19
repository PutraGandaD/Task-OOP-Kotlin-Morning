package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    val supportedCity = listOf<String>("Palembang", "Jakarta", "Yogyakarta")

    try {
        /*
            Change yourCurrentLocation value to be more than supportedCity size
            to trigger catch code execution
        */
        val yourCurrentLocation = 2
        println("Your current location is : ${supportedCity[yourCurrentLocation]}")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Your location isn't supported in this beta yet. \nCurrently there are only ${supportedCity.size} cities supported. \nThanks for showing your interest in this beta")
    } finally {
        println("Your data such as location and IP address is recorded to our server for intended stats data tracking use only.")
    }
}





