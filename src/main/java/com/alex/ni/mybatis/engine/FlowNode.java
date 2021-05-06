package com.alex.ni.mybatis.engine;

import org.apache.commons.lang.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author AlexNi
 * @Classname FlowNode
 * @Description TODO
 * @Date 2021/5/6 9:38
 */
public class FlowNode {

    private Map<String, NodeConf> nodeMap = new LinkedHashMap<>();

    private void add(String groupName, Class nodeName, NodeConf nodeConf) {
        String key = null;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + nodeName.getName();
        } else {
            key = nodeName.getName();
        }
        if (nodeMap.containsKey(key)) {
            return;
        }
         nodeMap.put(key, nodeConf);
    }

    public void add(Class nodeName, NodeConf nodeConf) {
        add(nodeName.getName(), nodeName, nodeConf);
    }

    public void  replace(String groupName, Class nodeName, NodeConf nodeConf) {
        String key = null;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + nodeName.getName();
        } else {
            key = nodeName.getName();
        }
        nodeMap.put(key, nodeConf);
    }

    public void replace(Class nodeName, NodeConf nodeConf) {
        replace(nodeName.getName(), nodeName, nodeConf);
    }

    public void remove(String groupName, Class nodeName) {
        String key = null;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + nodeName;
        } else {
            key = nodeName.getName();
        }
        nodeMap.remove(key);
    }

    public void remove(Class nodeName) {
        remove(nodeName.getName(), nodeName);
    }

    public Set<String> getNodeList() {
        return nodeMap.keySet();
    }

    public Map<String, NodeConf> getNodeMap() {
        return nodeMap;
    }

    public void setNodeMap(LinkedHashMap<String, NodeConf> map) {
        this.nodeMap = map;
    }

    public static class NodeConf {

        private int timeout = 100;

        public NodeConf() {};

        public NodeConf (int timeout) {
            this.timeout = timeout;
        }

        public int getTimeout() {
            return timeout;
        }

        public void setTimeout(int timeout) {
            this.timeout = timeout;
        }
    }
}
