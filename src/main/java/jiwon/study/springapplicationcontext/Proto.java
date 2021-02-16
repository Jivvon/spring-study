package jiwon.study.springapplicationcontext;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

// 직접 참조하면 새로운 객체를 만들지 못하니까 class 기반의 proxy를 만들어서 이걸 사용해라.
// INTERFACE도 같은 방법으로 사용 가능.
@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {

}
