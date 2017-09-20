package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by CX Wang on 2017/9/20.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName , Integer parentId);

    ServerResponse updateCategoryName(String categoryName , Integer categoryId);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
