package es.menorcadesign.grails.plugin.blog

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
