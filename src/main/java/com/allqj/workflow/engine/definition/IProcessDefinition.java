package com.allqj.workflow.engine.definition;

import com.allqj.workflow.engine.element.INode;
import com.allqj.workflow.engine.element.IStartNode;
import com.allqj.workflow.engine.element.Transition;
import com.allqj.workflow.infrastructure.repository.dataobj.ProcessDefinitionDO;

public interface IProcessDefinition {

    /**
     * 解析元素 json 字符串
     */
    void parsedElements();

    /**
     * 获取开始节点
     *
     * @return 开始节点
     */
    IStartNode getStartNode();

    /**
     * 获取下一连线
     *
     * @return 连线信息
     */
    Transition getNextTransitionByNodeId(String nodeId);

    /**
     * 获取下一节点
     *
     * @param nodeId 下一节点id
     * @return 节点信息
     */
    INode getNodeById(String nodeId);

    /**
     * 主键did
     *
     * @return
     */
    String getId();

    /**
     * 转换数据对象
     *
     * @return
     */
    ProcessDefinitionDO toDataObj();

    void setId(String id);

    void setName(String name);

    void setDescription(String description);

    void setElementJson(String elementJson);

    String getName();
}
