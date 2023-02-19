package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.jojo;
import org.apache.ibatis.annotations.Select;

public interface JOJOMapper extends BaseMapper<jojo> {
@Select("select*from jojo where name like 'A%';")
    jojo select2();
}
