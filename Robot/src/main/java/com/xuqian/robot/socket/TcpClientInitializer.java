package com.xuqian.robot.socket;

import com.xuqian.robot.codec.TcpDecoder;
import com.xuqian.robot.codec.TcpEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class TcpClientInitializer extends ChannelInitializer<SocketChannel> {

    private TcpClientHandler handler;

    public TcpClientInitializer(TcpClientHandler handler) {
        this.handler = handler;
    }

    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline p = socketChannel.pipeline();
        p.addLast("frameDecoder", new TcpDecoder());
        p.addLast("frameEncoder", new TcpEncoder());
        p.addLast("handler", handler);
    }

}
