package com.wangyigou.domain.pojogroup;


import com.wangyigou.domain.pojo.TbSpecification;
import com.wangyigou.domain.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * 规格组合业务实体
 */
public class Specification implements Serializable {

    private TbSpecification specification;
    private List<TbSpecificationOption> specificationOptionList;

    public TbSpecification getTbSpecification() {
        return specification;
    }

    public void setTbSpecification(TbSpecification tbSpecification) {
        this.specification = tbSpecification;
    }

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }
}