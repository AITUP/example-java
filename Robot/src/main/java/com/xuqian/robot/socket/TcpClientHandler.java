package com.xuqian.robot.socket;

import com.xuqian.robot.codec.MessageDTO;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TcpClientHandler extends SimpleChannelInboundHandler<MessageDTO> {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        System.out.println("连接..." + ctx.channel().id());

    }

    protected void channelRead0(ChannelHandlerContext ctx, MessageDTO messageDTO) throws Exception {
        System.out.println("接收到消息..." + ctx.channel().id() + "=" + messageDTO.toString());




    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        System.out.println("断开连接..." + ctx.channel().id());

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        System.out.println("连接异常..." + ctx.channel().id());


    }

}
