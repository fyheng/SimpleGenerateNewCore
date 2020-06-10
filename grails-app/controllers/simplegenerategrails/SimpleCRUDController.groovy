package simplegenerategrails

import grails.converters.JSON

class SimpleCRUDController {

    def simpleCRUDControllerService
    def index() {

        //this is we add new
        def newUser = simpleCRUDControllerService.saveAction()
        def checkCondition = simpleCRUDControllerService.serviceMethod()
        render (newUser) as JSON
    }
}
