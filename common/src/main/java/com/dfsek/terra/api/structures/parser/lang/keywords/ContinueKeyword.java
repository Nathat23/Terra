package com.dfsek.terra.api.structures.parser.lang.keywords;

import com.dfsek.terra.api.structures.parser.lang.Block;
import com.dfsek.terra.api.structures.parser.lang.Keyword;
import com.dfsek.terra.api.structures.structure.Rotation;
import com.dfsek.terra.api.structures.structure.buffer.Buffer;
import com.dfsek.terra.api.structures.tokenizer.Position;

public class ContinueKeyword implements Keyword<Block.ReturnLevel> {
    private final Position position;

    public ContinueKeyword(Position position) {
        this.position = position;
    }

    @Override
    public Block.ReturnLevel apply(Buffer buffer, Rotation rotation, int recursions) {
        return Block.ReturnLevel.CONTINUE;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public ReturnType returnType() {
        return ReturnType.VOID;
    }
}