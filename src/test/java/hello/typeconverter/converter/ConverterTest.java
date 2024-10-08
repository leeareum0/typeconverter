package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    // 문자 -> 숫자
    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        assertThat(result).isEqualTo(10);
    }

    // 숫자 -> 문자
    @Test
    void integerToString() {
        IntergerToStringConverter converter = new IntergerToStringConverter();
        String result = converter.convert(10);
        assertThat(result).isEqualTo("10");
    }

    // "127.0.0.1:8080" -> IpPort 객체
    @Test
    void stringToIpPort() {
        StringToIpPortConverter converter = new StringToIpPortConverter();
        String source = "127.0.0.1:8080";
        IpPort result = converter.convert(source);
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }

    // IpPort 객채 -> "127.0.0.1:8080"
    @Test
    void ipPortToString() {
        IpportToStringConverter converter = new IpportToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8080);
        String result = converter.convert(source);
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }
}
