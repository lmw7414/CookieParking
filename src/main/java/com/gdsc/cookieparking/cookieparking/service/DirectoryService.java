package com.gdsc.cookieparking.cookieparking.service;

import com.gdsc.cookieparking.cookieparking.domain.Directory;
import com.gdsc.cookieparking.cookieparking.domain.User;
import com.gdsc.cookieparking.cookieparking.repository.DirectoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectoryService {

    @Autowired
    private DirectoryRepository directoryRepository;

    public List<Directory> getDirectoryList(String userId) {
        return directoryRepository.findAllByUserId(userId);
    }
}
