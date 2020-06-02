package simplegenerategrails

import grails.converters.JSON

class SimpleCRUDController {

    def simpleCRUDControllerService
    def index() {

        render(simpleCRUDControllerService.serviceMethod()) as JSON
    }
}
