package es.menorcadesign.grails.plugin.blog

import grails.plugins.*

class BlogPluginGrailsPlugin extends Plugin {

    def grailsVersion = "3.2.10 > *"
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def title = "Blog Plugin"
    def author = "MenorcaDesign [eduardoespinosa: 'Eduardo Espinosa', pablocloud: 'Pablo Verdugo Huerta']"
    def authorEmail = ""
    def description = 'Blog system for a Grails app'
    def profiles = ['web']
    def documentation = "http://grails.org/plugin/blog-plugin"

    Closure doWithSpring() {
        { ->

        }
    }

    void doWithDynamicMethods() {

    }

    void doWithApplicationContext() {

    }

    void onChange(Map<String, Object> event) {

    }

    void onConfigChange(Map<String, Object> event) {

    }

    void onShutdown(Map<String, Object> event) {

    }
}
