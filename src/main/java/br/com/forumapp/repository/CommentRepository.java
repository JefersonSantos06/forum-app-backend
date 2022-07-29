package br.com.forumapp.repository;

import br.com.forumapp.model.Comment;
import br.com.forumapp.model.Post;
import br.com.forumapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
