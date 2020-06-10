package simplegenerategrails


class SimpleCRUDControllerService {

    def serviceMethod() {
        println ("=============This is debug project")
        return "=============This is debug project"
    }

    def saveAction() {
        def user = new SecUser()
        user.userName = "TEST"
        user.email = "hengta56@gmail.com"
        user.password = "P@ssw0rd"
        user.fullName = "Ly heng"

        user.save()

        return user
    }
}
