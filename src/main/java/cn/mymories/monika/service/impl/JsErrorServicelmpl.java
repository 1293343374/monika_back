package cn.mymories.monika.service.impl;

import cn.mymories.monika.mbg.mapper.JsErrorMapper;
import cn.mymories.monika.mbg.model.JsError;
import cn.mymories.monika.mbg.model.JsErrorExample;
import cn.mymories.monika.service.JsErrorService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JsErrorServicelmpl implements JsErrorService {
    @Autowired
    private JsErrorMapper JsErrorMapper;

    @Override
    public List<JsError> getJsError(String pkProjectId, int pageNum, int pageSize) {
        //根据项目id pk_project_id查询JsError
        JsErrorExample jsErrorExample = new JsErrorExample();
        jsErrorExample.createCriteria().andPkProjectIdEqualTo(pkProjectId);
        //按照首次出现时间降序排序（新的在前）
        jsErrorExample.setOrderByClause("first_appearedtime DESC");
        //使用分页插件根据参数返回,某一页面的list
        PageHelper.startPage(pageNum,pageSize);
        List<JsError> JsErrorList = JsErrorMapper.selectByExample(jsErrorExample);
        return JsErrorList;
    }


    //是否使用sourcemap反解
//    @Override
//    public JsErrorDetail getJsErrorDetail(String JsErrorDetailId, boolean isMapped) {
//        return null;
//    }
}
