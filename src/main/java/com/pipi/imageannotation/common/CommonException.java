/**
 * @Time: 2024/9/14 17:16
 * @Author: guoxun
 * @File: CommonException
 * @Description:
 */

package com.pipi.imageannotation.common;

import lombok.Data;

@Data
public class CommonException extends RuntimeException{

    public CommonException(String message){
        super(message);
    }
    
}
