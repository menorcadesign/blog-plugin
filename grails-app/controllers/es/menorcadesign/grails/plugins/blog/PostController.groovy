package es.menorcadesign.grails.plugins.blog

import grails.transaction.Transactional

class PostController {

    def index() {
        [posts: Post.listOrderById(params)]
    }

    def show(Post post) {
        [post: post]
    }

    @Transactional
    doInsertPost(Post post) {
        post.date = new Date()
        post.save()
    }

    @Transactional
    doUpdatePost(Post post) {
        post.save()
    }

    @Transactional
    doDeletePost(Post post) {
        post.delete()
    }

}
