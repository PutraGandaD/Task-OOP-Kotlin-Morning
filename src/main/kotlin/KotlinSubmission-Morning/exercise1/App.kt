package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Putra Ganda"
    val lastName: String = "Dewata"
    val age: Int = 19
    val status: Boolean = true

    println("============ MY PROFILE ============")
    println("Your first name is $firstName")
    println("Your last name is $lastName")
    println("Your age is $age years old")
    println("Are you single ? $status")
    println("====================================")
    print("\n")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    var i : Int = 0
    print("\n")
    println("============ GROUP DETAIL ============")
    println("Group number = " + groupId)
    println("Group member = ")
    for (member in groupMember) {
        i++
        println("$i. " + member)
    }
    println("Session = " + session)
    println("======================================")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMember = listOf<String>("Putra Ganda Dewata", "Whatever", "It", "Takes")
    return listOf(teamMember[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Kelvin", "Kak Shania", "Kak Iffan")
    val countOfGroup = arrayOf<String>("Putra Ganda", "Whatever")
    val totalCount = mentor.size + countOfGroup.size

    return totalCount
}

fun main() {
    myProfile()

    println("======================================")
    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")
    println("======================================")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("13", listOf("Putra", "Anna"), "Morning")

}