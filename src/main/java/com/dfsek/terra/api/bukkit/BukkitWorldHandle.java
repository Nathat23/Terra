package com.dfsek.terra.api.bukkit;

import com.dfsek.terra.api.bukkit.world.block.BukkitBlockData;
import com.dfsek.terra.api.bukkit.world.block.BukkitMaterialData;
import com.dfsek.terra.api.bukkit.world.block.data.BukkitStairs;
import com.dfsek.terra.api.bukkit.world.block.data.BukkitWaterlogged;
import com.dfsek.terra.api.generic.world.WorldHandle;
import com.dfsek.terra.api.generic.world.block.BlockData;
import com.dfsek.terra.api.generic.world.block.MaterialData;
import com.dfsek.terra.api.generic.world.block.data.Waterlogged;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.Stairs;

public class BukkitWorldHandle implements WorldHandle {

    @Override
    public void setBlockData(Block block, org.bukkit.block.data.BlockData data, boolean physics) {
        block.setBlockData(data, physics);
    }

    @Override
    public org.bukkit.block.data.BlockData getBlockData(Block block) {
        return block.getBlockData();
    }

    @Override
    public Material getType(Block block) {
        return block.getType();
    }

    @Override
    public BlockData createBlockData(String data) {
        org.bukkit.block.data.BlockData bukkitData = Bukkit.createBlockData(data);
        if(bukkitData instanceof Stairs) return new BukkitStairs(bukkitData);
        if(bukkitData instanceof Waterlogged) return new BukkitWaterlogged(bukkitData);
        return new BukkitBlockData(Bukkit.createBlockData(data));
    }

    @Override
    public MaterialData createMaterialData(String data) {
        return new BukkitMaterialData(Material.matchMaterial(data));
    }
}