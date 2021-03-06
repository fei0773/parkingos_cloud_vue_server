package parkingos.com.bolink.service;

import com.alibaba.fastjson.JSONObject;
import parkingos.com.bolink.models.CarTypeTb;
import parkingos.com.bolink.models.VisitorTb;

import java.util.List;
import java.util.Map;

public interface VisitorService {
    public JSONObject selectResultByConditions(Map<String, String> map);

    List<List<Object>> exportExcel(Map<String, String> reqParameterMap);

    JSONObject updateVisitor(VisitorTb visitorTb);
}
