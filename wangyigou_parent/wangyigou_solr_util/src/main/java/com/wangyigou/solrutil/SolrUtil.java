package com.wangyigou.solrutil;


import com.wangyigou.domain.pojo.TbItem;
import com.wangyigou.mapper.TbItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SolrUtil {

    @Autowired
    private TbItemMapper itemMapper;
    @Autowired
    private SolrTemplate solrTemplate;

    /**
     * 导入商品数据
     */
    public void importItemData(){
        TbItem tbItem = new TbItem();
        tbItem.setStatus("1");
        //查询商品状态为1的
        List<TbItem> items = itemMapper.select(tbItem);


    }

}
