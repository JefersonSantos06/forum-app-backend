package br.com.forumapp.repository;

import br.com.forumapp.model.Post;
import br.com.forumapp.model.Community;
import br.com.forumapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByCommunity(Community community);

    List<Post> findByUser(User user);
}
