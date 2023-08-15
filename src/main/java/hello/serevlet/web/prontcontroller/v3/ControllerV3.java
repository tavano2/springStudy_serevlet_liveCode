package hello.serevlet.web.prontcontroller.v3;

import hello.serevlet.web.prontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String,String> paramMap);
}
