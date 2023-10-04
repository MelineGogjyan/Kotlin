package com.example.myapplication.agbu.homework1.homework1_2

class CV (
    var firstname: String,
    var lastname: String,
    age: Int,
    education: Array<Education>,
    experience: Array<Experience>,
    language: Array<Languages>,
    skills: Array<Skills>) {


        var age: Int = age
        set(value) {
            if (value > 0)
                field = value
        }

        var education: Education? = null
        set(value) {
            if (value != null) {
                field = value
            }
        }
//        get() {

//            return education
//        }

        var experience: Experience? = null
        set(value) {
            if (value != null) {
                field = value
            }
        }
//        get() {
//            return experience
//        }

        var language: Languages? = null
        set(value) {
            if (value != null)  {
                field = value
            }
        }
//        get() {
//            return language
//        }

        var skills: Skills? = null
        set(value) {
            if (value != null) {
                field = value
            }
        }
//        get() {
//            return skills
//        }
}

class Education(name: String, department: String, startYear: Int, endYear: Int)
class Experience(val name: String, startYear: Int, endYear: Int)
class Languages(language: String, level: String)
class Skills(vararg name: String)