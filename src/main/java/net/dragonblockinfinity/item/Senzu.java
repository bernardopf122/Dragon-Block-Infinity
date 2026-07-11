package net.dragonblockinfinity.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.Level;

public class Senzu extends Item {
    private static final int COOLDOWN_DURATION = 100; // 5 segundos (20 ticks por segundo)
    
    public Senzu(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        
        if (!level.isClientSide && player.canEat(false)) {
            // Regenera toda a vida
            player.setHealth(player.getMaxHealth());
            
            // Regenera toda a fome
            player.getFoodData().setFoodLevel(20);
            
            // Remove um item do stack
            itemStack.shrink(1);
            
            // Adiciona cooldown de 5 segundos
            player.getCooldowns().addCooldown(this, COOLDOWN_DURATION);
        }
        
        return InteractionResultHolder.success(itemStack);
    }

    public static void SenzuProperties() {
        
    }
}
