package com.og.todo.domain.interactors;

import com.og.todo.domain.executor.Executor;
import com.og.todo.domain.executor.MainThread;
import com.og.todo.domain.interactors.base.AbstractInteractor;

/**
 *
 * Created by orenegauthier on 10/08/2017.
 */

public class GetItemsUseCase extends AbstractInteractor {

    public GetItemsUseCase(Executor threadExecutor, MainThread mainThread) {
        super(threadExecutor, mainThread);
    }

    @Override
    public void run() {

    }
}
