package com.dute.officialNetwork.service.impl.upload;

import com.dute.officialNetwork.util.DateUtils;
import com.dute.officialNetwork.util.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class ResourceService {

    @Value("up_load_path")
    private String path;

    public String upload(MultipartFile file){


        String location = DateUtils.getDate() + "/";
        // 判断文件夹是否存在，不存在则
        File targetFile = new File(path + location);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        String fileName = FileUtils.checkFileName(file);

        try {
            try {
                Files.copy(file.getInputStream(), Paths.get(path + location, fileName), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {

        }
        //返回json
        return location+fileName;
    }


}
