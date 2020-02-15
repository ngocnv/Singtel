package com.sg.assigment.bonus.rpc;

import com.sg.assigment.bonus.dto.RpcRequest;
import com.sg.assigment.bonus.dto.RpcResponse;

public interface RpcClient {

	RpcResponse send(RpcRequest req);

}
