package es.menorcadesign.grails.plugins.blog

class Post {

    Date date
    String title
    String content

    static constraints = {

    }

    static mapping = {
        content type: 'text'
    }

}
