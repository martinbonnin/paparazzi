rootProject.name="composite"


include(":sample")
project(":sample").projectDir = file("../sample")
includeBuild("../") {
//    dependencySubstitution {
//        substitute(module("app.cash.paparazzi:layoutlib")).apply {
//            with(module("app.cash.paparazzi:layoutlib:3.4.0"))
//        }
//    }
}

