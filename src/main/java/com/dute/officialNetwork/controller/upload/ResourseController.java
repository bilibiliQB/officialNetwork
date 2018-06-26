package com.dute.officialNetwork.controller.upload;

import com.dute.officialNetwork.service.impl.upload.ResourceService;
import com.dute.officialNetwork.util.ResultData;
import com.dute.officialNetwork.util.StringUtils;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Iterator;
import java.util.List;
@Api(description = "多文件上传")
@RestController
@RequestMapping(value = "/resource", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ResourseController {
    @Autowired
    private ResourceService resourceService;

    @PostMapping()
    public ResultData<List<String>> upload(MultipartHttpServletRequest request) {
        ResultData<List<String>> r = new ResultData<>();

        List<String> fileIds = null;
        try {
            fileIds = Lists.newArrayList();
            MultiValueMap<String, MultipartFile> fileNames = request.getMultiFileMap();
            List<MultipartFile> multipartFiles = fileNames.get("request");
            Iterator<MultipartFile> iterator = multipartFiles.iterator();

            while (iterator.hasNext()) {
                MultipartFile file = iterator.next();
                String fileId = resourceService.upload(file);
                if (StringUtils.isEmpty(fileId)) continue;
                fileIds.add(fileId);
            }
            if (fileIds.isEmpty()) {
                r.setStatus(ResultData.CODE_FAIL_BIZ);
                r.setMessage("请至少上传一个文件");
                return r;
            }
            r.setData(fileIds);
            return r;
        } catch (Exception e) {
            r.setStatus(ResultData.CODE_FAIL_BIZ);
            r.setMessage(e.getMessage());
            return r;
        }
    }

}
