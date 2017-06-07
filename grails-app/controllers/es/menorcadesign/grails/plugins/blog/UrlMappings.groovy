package es.menorcadesign.grails.plugins.blog

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/blog"(controller: 'post', action: 'index')
        "/blog/$id"(controller: 'post', action: 'show')

    }
}