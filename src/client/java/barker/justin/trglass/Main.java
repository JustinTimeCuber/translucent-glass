package barker.justin.trglass;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Main implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer("translucent-glass").ifPresent(container -> {
            ResourceManagerHelper.registerBuiltinResourcePack(Identifier.of("translucent-glass", "translucent-glass"), container, Text.literal("Translucent Glass"), ResourcePackActivationType.DEFAULT_ENABLED);
        });
        BlockRenderLayerMap.putBlock(Blocks.GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(Blocks.GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(Blocks.BEACON, BlockRenderLayer.TRANSLUCENT);
    }
}
