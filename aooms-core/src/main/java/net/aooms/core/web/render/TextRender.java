package net.aooms.core.web.render;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 文本渲染
 * Created by cccyb on 2018-04-20
 */
public class TextRender extends IRender {

    public TextRender() {
        this.renderType = RenderType.TEXT;
    }

    @Override
    public void render(HttpServletResponse response, Object value) throws IOException {
        response.setContentType(renderType.getContentType());
        response.getWriter().write(String.valueOf(value));
        this.flushAndClose(response);
    }

}