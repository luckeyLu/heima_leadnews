package com.heima.article.apis;

import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.article.pojos.ApArticle;
import com.heima.model.common.dtos.ResponseResult;

import java.util.List;

public interface ArticleHomeControllerApi {

    /**
     * 加载首页文章
     * @param dto
     * @return
     */
    public ResponseResult<List<ApArticle>> load(ArticleHomeDto dto);

    /**
     * 加载更多
     * @param dot
     * @return
     */
    public ResponseResult<List<ApArticle>> loadMore(ArticleHomeDto dot);

    /**
     * 加载最新的文章信息
     * @param dto
     * @return
     */
    public ResponseResult<List<ApArticle>> loadNew(ArticleHomeDto dto);
}
