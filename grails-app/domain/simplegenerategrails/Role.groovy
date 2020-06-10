package simplegenerategrails

class Role {
    String name
    Boolean isActive = true
    String description

    static constraints = {
        isActive nullable: false
        description nullable: true
    }

}
