package simplegenerategrails

class SecUser {
    String userName
    String password
    String email
    String fullName

    static constraints = {
        email nullable: true
        fullName nullable: true
    }
}
