package simplegenerategrails

import grails.converters.JSON

class SimpleCRUDController {

    def simpleCRUDControllerService
    def index() {

        //this is we add new 
        render simpleCRUDControllerService.serviceMethod() as JSON
    }
}
