package com.dfsek.terra.biome.palette;

import org.bukkit.block.data.BlockData;
import org.polydev.gaea.math.ProbabilityCollection;

public class PaletteLayer {
    private final ProbabilityCollection<BlockData> layer;
    private final int size;

    public PaletteLayer(ProbabilityCollection<BlockData> layer, int size) {
        this.layer = layer;
        this.size = size;
    }

    public ProbabilityCollection<BlockData> getLayer() {
        return layer;
    }

    public int getSize() {
        return size;
    }
}
