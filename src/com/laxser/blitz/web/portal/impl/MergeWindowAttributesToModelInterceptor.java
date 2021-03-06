/*
 * Copyright 2007-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.laxser.blitz.web.portal.impl;

import com.laxser.blitz.web.ControllerInterceptorAdapter;
import com.laxser.blitz.web.Invocation;
import com.laxser.blitz.web.portal.PortalUtils;
import com.laxser.blitz.web.portal.Window;


/**
 * 这个interceptor 用来将所有的内置窗口属性合并到一起
 *@author laxser  Date 2012-3-23 下午4:54:07
@contact [duqifan@gmail.com]
@MergeWindowAttributesToModelInterceptor.java
 
 */
public class MergeWindowAttributesToModelInterceptor extends ControllerInterceptorAdapter {

    @Override
    public Object after(Invocation inv, Object instruction) throws Exception {
        Window window = PortalUtils.getWindow(inv);
        if (window != null) {
            inv.getModel().merge(window.getAttributes());
        }
        return instruction;
    }

}
