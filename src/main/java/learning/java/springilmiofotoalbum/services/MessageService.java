package learning.java.springilmiofotoalbum.services;

import learning.java.springilmiofotoalbum.models.Message;
import learning.java.springilmiofotoalbum.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.findAll(Sort.by("createdAt"));
    }


}
