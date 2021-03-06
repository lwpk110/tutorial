/**
 * <p>Description:
 *  DDD：interface 用户界面层（或表示层） 最顶层。
 *  负责向用户显示信息和解释用户命令。
 *  请求应用层以获取用户所需要展现的数据（比如获取应用系统数据）。
 *  发送命令给应用层要求其执行某个用户命令（实现某个业务逻辑，比如用户新增应用系统）。
 * </p>
 *
 * <p>
 *  用户界面层包含以下内容：
 *  <ul>
 *      <li>数据传输对象（data transfer object）：DTO也被常称作值对象，是数据传输的载体，内部不应该存在任何业务逻辑，通过DTO把内部的领域对象与外界隔离。</li>
 *      <li>装配（assembler）：实现DTO与领域对象之间的相互转换、数据交换，因此assembler几乎总是同DTO一起出现。</li>
 *      <li>表面，门面（facade）:facade的用意在于为远程客户端提供粗粒度的调用接口，它的主要工作就是将一个用户请求委派给一个或者多个service进行处理，也是常用的controller。</li>
 *  </ul>
 * </p>
 *
 */
package cn.ddd.interfacecs;