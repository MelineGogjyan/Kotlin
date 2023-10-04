package com.example.myapplication.agbu.homework1.homework1_2

fun main() {
    val webDeveloper = Education(
        "Basic It school",
        "Python-Django developer",
        2022,
        2023 )
    val polytechnic = Education(
        "National Polytechnic University of Armenia",
        "Informatics (Computer science)",
        2024,
        2030)
    val developer = Experience(
        "Google LLC",
        2028,
        2035)
    val cyberSecurity = Experience(
        "Leidos",
        2035,
        2038)
    val hy = Languages("Armenian", "Native")
    val rus = Languages("Russian", "Bilingual")
    val eng = Languages("English", "Elementary")
    val soft = Skills("Analytical skills", "Teamwork", "Time Management")
    val hard = Skills("Ms Office", "Python", "Django", "OOP", "Git", "Java Core")
    val cv = CV(
        "Meline",
        "Gogjyan",
        19,
        arrayOf(webDeveloper, polytechnic),
        arrayOf(developer, cyberSecurity),
        arrayOf(hy, rus, eng),
        arrayOf(soft, hard)
    )
    println("""
        Firstname ${cv.firstname}
        Lastname ${cv.lastname}
        Age ${cv.age}
        ________________________
        Education
           ${cv.education}
        ________________________
        Experience
           ${cv.experience}
        ________________________
        Languages 
            ${cv.language}
        ________________________
        Skills 
            ${cv.skills}
    """)


}