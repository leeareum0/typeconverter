package hello.typeconverter.converter;

import hello.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {

        // 등록 - 스프링 내부에서 사용하는 ConversionService에 컨버터가 추가된다.
        //주석처리 우선순위
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntergerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpportToStringConverter());

        //추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
