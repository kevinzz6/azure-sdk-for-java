// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redis.RedisManager;
import com.azure.resourcemanager.redis.fluent.models.RedisResourceInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.GroupableResource;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasId;
import com.azure.resourcemanager.resources.fluentcore.arm.models.Resource;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListingPrivateEndpointConnection;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListingPrivateLinkResource;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsUpdatingPrivateEndpointConnection;
import com.azure.resourcemanager.resources.fluentcore.model.Appliable;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.model.Refreshable;
import com.azure.resourcemanager.resources.fluentcore.model.Updatable;

import java.time.Duration;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of an Azure Redis Cache. */
@Fluent
public interface RedisCache extends GroupableResource<RedisManager, RedisResourceInner>, Refreshable<RedisCache>,
    Updatable<RedisCache.Update>, SupportsListingPrivateLinkResource, SupportsListingPrivateEndpointConnection,
    SupportsUpdatingPrivateEndpointConnection {

    /**
     * Gets an instance of the Azure Redis cache with Premium SKU.
     *
     * @return exposes features available only to Premium Sku Redis Cache instances.
     */
    RedisCachePremium asPremium();

    /**
     * Checks whether current Redis Cache instance has Premium Sku.
     *
     * @return returns true if current Redis Cache instance has Premium Sku.
     */
    boolean isPremium();

    /**
     * Gets the provisioning state.
     *
     * @return the provisioningState value
     */
    String provisioningState();

    /**
     * Gets the host name.
     *
     * @return the hostname value
     */
    String hostname();

    /**
     * Gets the port.
     *
     * @return the port value
     */
    int port();

    /**
     * Gets SSL port.
     *
     * @return the sslPort value
     */
    int sslPort();

    /**
     * Gets the redis version
     *
     * @return the Redis version value
     */
    String redisVersion();

    /**
     * Gets the SKU.
     *
     * @return the sku value
     */
    Sku sku();

    /**
     * Gets the redis configuration.
     *
     * @return the Redis configuration value
     */
    Map<String, String> redisConfiguration();

    /**
     * Checks whether non SSL port is enabled.
     *
     * @return true if non SSL port is enabled, false otherwise
     */
    boolean nonSslPort();

    /**
     * Gets count of the shard.
     *
     * @return the shardCount value
     */
    int shardCount();

    /**
     * Gets the resource id of the subnet.
     *
     * @return the subnetId value
     */
    String subnetId();

    /**
     * Gets the static IP.
     *
     * @return the staticIP value
     */
    String staticIp();

    /**
     * Gets the minimum TLS version (or higher) that clients require to use.
     *
     * @return the minimum TLS version (or higher) that clients require to use.
     */
    TlsVersion minimumTlsVersion();

    /**
     * Gets firewall rules in the Redis Cache.
     *
     * @return Firewall Rules in the Redis Cache, indexed by name
     */
    Map<String, RedisFirewallRule> firewallRules();

    /**
     * Gets list of patch schedules for current Redis Cache.
     *
     * @return List of patch schedules for current Redis Cache.
     */
    List<ScheduleEntry> patchSchedules();

    /**
     * Reboot specified Redis node(s). This operation requires write permission to the cache resource. There can be
     * potential data loss.
     *
     * @param rebootType specifies which Redis node(s) to reboot. Depending on this value data loss is possible.
     *     Possible values include: 'PrimaryNode', 'SecondaryNode', 'AllNodes'.
     */
    void forceReboot(RebootType rebootType);

    /**
     * Gets a Redis Cache's access keys.
     *
     * @return a Redis Cache's access keys. This operation requires write permission to the Cache resource.
     */
    RedisAccessKeys keys();

    /**
     * Fetch the up-to-date access keys from Azure for this Redis Cache.
     *
     * @return the access keys for this Redis Cache
     */
    RedisAccessKeys refreshKeys();

    /**
     * Regenerates the access keys for this Redis Cache.
     *
     * @param keyType key type to regenerate
     * @return the generated access keys for this Redis Cache
     */
    RedisAccessKeys regenerateKey(RedisKeyType keyType);

    /**
     * Whether the redis cache can be accessed from public network.
     *
     * @return whether the redis cache can be accessed from public network.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**************************************************************
     * Fluent interfaces to provision a RedisCache
     **************************************************************/

    /** Container interface for all the definitions that need to be implemented. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku,
        DefinitionStages.WithCreate, DefinitionStages.WithPremiumSkuCreate {
    }

    /** Grouping of all the Redis Cache definition stages. */
    interface DefinitionStages {
        /** The first stage of the Redis Cache definition. */
        interface Blank extends DefinitionWithRegion<WithGroup> {
        }

        /** A Redis Cache definition allowing resource group to be set. */
        interface WithGroup extends GroupableResource.DefinitionStages.WithGroup<WithSku> {
        }

        /** A Redis Cache definition allowing the sku to be set. */
        interface WithSku {
            /**
             * Specifies the Basic sku of the Redis Cache.
             *
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withBasicSku();

            /**
             * Specifies the Basic sku of the Redis Cache.
             *
             * @param capacity specifies what size of Redis Cache to deploy for Basic sku with C family (0, 1, 2, 3, 4,
             *     5, 6).
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withBasicSku(int capacity);

            /**
             * Specifies the Standard Sku of the Redis Cache.
             *
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withStandardSku();

            /**
             * Specifies the Standard sku of the Redis Cache.
             *
             * @param capacity specifies what size of Redis Cache to deploy for Standard sku with C family (0, 1, 2, 3,
             *     4, 5, 6).
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withStandardSku(int capacity);

            /**
             * Specifies the Premium sku of the Redis Cache.
             *
             * @return the next stage of Redis Cache definition.
             */
            WithPremiumSkuCreate withPremiumSku();

            /**
             * Specifies the Premium sku of the Redis Cache.
             *
             * @param capacity specifies what size of Redis Cache to deploy for Standard sku with P family (1, 2, 3, 4).
             * @return the next stage of Redis Cache definition.
             */
            WithPremiumSkuCreate withPremiumSku(int capacity);
        }

        /**
         * A Redis Cache definition with sufficient inputs to create a new Redis Cache in the cloud, but exposing
         * additional optional inputs to specify.
         */
        interface WithCreate extends Creatable<RedisCache>, DefinitionWithTags<WithCreate> {
            /**
             * Enables non-ssl Redis server port (6379).
             *
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withNonSslPort();

            /**
             * All Redis Settings. Few possible keys: rdb-backup-enabled, rdb-storage-connection-string,
             * rdb-backup-frequency, maxmemory-delta, maxmemory-policy, notify-keyspace-events, maxmemory-samples,
             * slowlog-log-slower-than, slowlog-max-len, list-max-ziplist-entries, list-max-ziplist-value,
             * hash-max-ziplist-entries, hash-max-ziplist-value, set -max-intset-entries, zset-max-ziplist-entries,
             * zset-max-ziplist-value etc.
             *
             * @param redisConfiguration configuration of Redis Cache as a map indexed by configuration name
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withRedisConfiguration(Map<String, String> redisConfiguration);

            /**
             * Specifies Redis Setting. rdb-backup-enabled, rdb-storage-connection-string, rdb-backup-frequency,
             * maxmemory-delta, maxmemory-policy, notify-keyspace-events, maxmemory-samples, slowlog-log-slower-than,
             * slowlog-max-len, list-max-ziplist-entries, list-max-ziplist-value, hash-max-ziplist-entries,
             * hash-max-ziplist-value, set -max-intset-entries, zset-max-ziplist-entries, zset-max-ziplist-value etc.
             *
             * @param key Redis configuration name.
             * @param value Redis configuration value.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withRedisConfiguration(String key, String value);

            /**
             * Specifies Redis Setting.
             *
             * @param redisConfiguration the Redis configuration.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withRedisConfiguration(RedisConfiguration redisConfiguration);

            /**
             * Creates Redis cache firewall rule with range of IP addresses permitted to connect to the cache.
             *
             * @param name name of the rule.
             * @param lowestIp lowest IP address included in the range.
             * @param highestIp highest IP address included in the range.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withFirewallRule(String name, String lowestIp, String highestIp);

            /**
             * Creates Redis cache firewall rule with range of IP addresses permitted to connect to the cache.
             *
             * @param rule firewall rule that specifies name, lowest and highest IP address included in the range of
             *     permitted IP addresses.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withFirewallRule(RedisFirewallRule rule);

            /**
             * Requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2').
             *
             * @param tlsVersion minimum TLS version.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withMinimumTlsVersion(TlsVersion tlsVersion);

            /**
             * Patch schedule on a Premium Cluster Cache.
             *
             * @param dayOfWeek day of week when cache can be patched.
             * @param startHourUtc start hour after which cache patching can start.
             * @return the next stage of Redis Cache with Premium SKU definition.
             */
            WithCreate withPatchSchedule(DayOfWeek dayOfWeek, int startHourUtc);

            /**
             * Patch schedule on a Premium Cluster Cache.
             *
             * @param dayOfWeek day of week when cache can be patched.
             * @param startHourUtc start hour after which cache patching can start.
             * @param maintenanceWindow ISO8601 timespan specifying how much time cache patching can take.
             * @return the next stage of Redis Cache with Premium SKU definition.
             */
            WithCreate withPatchSchedule(DayOfWeek dayOfWeek, int startHourUtc, Duration maintenanceWindow);

            /**
             * Patch schedule on a Premium Cluster Cache.
             *
             * @param scheduleEntry Patch schedule entry for Premium Redis Cache.
             * @return the next stage of Redis Cache with Premium SKU definition.
             */
            WithCreate withPatchSchedule(ScheduleEntry scheduleEntry);

            /**
             * Patch schedule on a Premium Cluster Cache.
             *
             * @param scheduleEntry List of patch schedule entries for Premium Redis Cache.
             * @return the next stage of Redis Cache with Premium SKU definition.
             */
            WithCreate withPatchSchedule(List<ScheduleEntry> scheduleEntry);

            /**
             * Explicitly specify the Redis version to create with
             * @param redisVersion the redisVersion value to set.
             * @return the next stage of Redis Cache with Premium SKU definition.
             */
            WithCreate withRedisVersion(RedisVersion redisVersion);

            /**
             * Disables public network access for the redis cache.
             *
             * @return the next stage of the definition
             */
            WithCreate disablePublicNetworkAccess();
        }

        /** A Redis Cache definition with Premium Sku specific functionality. */
        interface WithPremiumSkuCreate extends DefinitionStages.WithCreate {

            /**
             * The number of shards to be created on a Premium Cluster Cache.
             *
             * @param shardCount the shard count value to set.
             * @return the next stage of Redis Cache with Premium SKU definition.
             */
            WithPremiumSkuCreate withShardCount(int shardCount);

            /**
             * Assigns the specified subnet to this instance of Redis Cache.
             *
             * @param network instance of Network object.
             * @param subnetName the name of the subnet.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withSubnet(HasId network, String subnetName);

            /**
             * Assigns the specified subnet to this instance of Redis Cache.
             *
             * @param subnetId resource id of subnet.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withSubnet(String subnetId);

            /**
             * Sets Redis Cache static IP. Required when deploying a Redis Cache inside an existing Azure Virtual
             * Network.
             *
             * @param staticIp the static IP value to set.
             * @return the next stage of Redis Cache definition.
             */
            WithCreate withStaticIp(String staticIp);
        }
    }

    /** Grouping of all the Redis Cache update stages. */
    interface UpdateStages {
        /** A Redis Cache update stage allowing to change the parameters. */
        interface WithSku {

            /**
             * Updates Redis Cache to Basic sku with new capacity.
             *
             * @param capacity specifies what size of Redis Cache to update to for Basic sku with C family (0, 1, 2, 3,
             *     4, 5, 6).
             * @return the next stage of Redis Cache update.
             */
            Update withBasicSku(int capacity);

            /**
             * Updates Redis Cache to Standard sku.
             *
             * @return the next stage of Redis Cache update.
             */
            Update withStandardSku();

            /**
             * Updates Redis Cache to Standard sku with new capacity.
             *
             * @param capacity specifies what size of Redis Cache to update to for Standard sku with C family (0, 1, 2,
             *     3, 4, 5, 6).
             * @return the next stage of Redis Cache update.
             */
            Update withStandardSku(int capacity);

            /**
             * Updates Redis Cache to Premium sku.
             *
             * @return the next stage of Redis Cache update.
             */
            Update withPremiumSku();

            /**
             * Updates Redis Cache to Premium sku with new capacity.
             *
             * @param capacity specifies what size of Redis Cache to update to for Premium sku with P family (1, 2, 3,
             *     4).
             * @return the next stage of Redis Cache update.
             */
            Update withPremiumSku(int capacity);
        }

        /** A Redis Cache update allowing non SSL port to be enabled or disabled. */
        interface WithNonSslPort {
            /**
             * Enables non-ssl Redis server port (6379).
             *
             * @return the next stage of Redis Cache update.
             */
            Update withNonSslPort();

            /**
             * Disables non-ssl Redis server port (6379).
             *
             * @return the next stage of Redis Cache update.
             */
            Update withoutNonSslPort();
        }

        /** A Redis Cache update allowing Redis configuration to be modified. */
        interface WithRedisConfiguration {
            /**
             * All Redis Settings. Few possible keys: rdb-backup-enabled, rdb-storage-connection-string,
             * rdb-backup-frequency, maxmemory-delta, maxmemory-policy, notify-keyspace-events, maxmemory-samples,
             * slowlog-log-slower-than, slowlog-max-len, list-max-ziplist-entries, list-max-ziplist-value,
             * hash-max-ziplist-entries, hash-max-ziplist-value, set -max-intset-entries, zset-max-ziplist-entries,
             * zset-max-ziplist-value etc.
             *
             * @param redisConfiguration configuration of Redis Cache as a map indexed by configuration name
             * @return the next stage of Redis Cache update.
             */
            Update withRedisConfiguration(Map<String, String> redisConfiguration);

            /**
             * Specifies Redis Setting. rdb-backup-enabled, rdb-storage-connection-string, rdb-backup-frequency,
             * maxmemory-delta, maxmemory-policy, notify-keyspace-events, maxmemory-samples, slowlog-log-slower-than,
             * slowlog-max-len, list-max-ziplist-entries, list-max-ziplist-value, hash-max-ziplist-entries,
             * hash-max-ziplist-value, set -max-intset-entries, zset-max-ziplist-entries, zset-max-ziplist-value etc.
             *
             * @param key Redis configuration name.
             * @param value Redis configuration value.
             * @return the next stage of Redis Cache update.
             */
            Update withRedisConfiguration(String key, String value);

            /**
             * Specifies Redis Setting.
             *
             * @param redisConfiguration the Redis configuration.
             * @return the next stage of Redis Cache update.
             */
            Update withRedisConfiguration(RedisConfiguration redisConfiguration);

            /**
             * Cleans all the configuration settings being set on Redis Cache.
             *
             * @return the next stage of Redis Cache update.
             */
            Update withoutRedisConfiguration();

            /**
             * Removes specified Redis Cache configuration setting.
             *
             * @param key Redis configuration name.
             * @return the next stage of Redis Cache update.
             */
            Update withoutRedisConfiguration(String key);
        }

        /** The stage of redis cache update allowing to configure network access settings. */
        interface WithPublicNetworkAccess {
            /**
             * Enables public network access for the redis cache.
             *
             * @return the next stage of the update
             */
            Update enablePublicNetworkAccess();

            /**
             * Disables public network access for the redis cache.
             *
             * @return the next stage of the update
             */
            Update disablePublicNetworkAccess();
        }
    }

    /** The template for a Redis Cache update operation, containing all the settings that can be modified. */
    interface Update extends Appliable<RedisCache>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku,
        UpdateStages.WithNonSslPort, UpdateStages.WithRedisConfiguration, UpdateStages.WithPublicNetworkAccess {
        /**
         * The number of shards to be created on a Premium Cluster Cache.
         *
         * @param shardCount the shard count value to set.
         * @return the next stage of Redis Cache update.
         */
        Update withShardCount(int shardCount);

        /**
         * Adds Patch schedule to the current Premium Cluster Cache.
         *
         * @param dayOfWeek day of week when cache can be patched.
         * @param startHourUtc start hour after which cache patching can start.
         * @return the next stage of Redis Cache with Premium SKU definition.
         */
        Update withPatchSchedule(DayOfWeek dayOfWeek, int startHourUtc);

        /**
         * Adds Patch schedule to the current Premium Cluster Cache.
         *
         * @param dayOfWeek day of week when cache can be patched.
         * @param startHourUtc start hour after which cache patching can start.
         * @param maintenanceWindow ISO8601 timespan specifying how much time cache patching can take.
         * @return the next stage of Redis Cache with Premium SKU definition.
         */
        Update withPatchSchedule(DayOfWeek dayOfWeek, int startHourUtc, Duration maintenanceWindow);

        /**
         * Adds Patch schedule to the current Premium Cluster Cache.
         *
         * @param scheduleEntry Patch schedule entry for Premium Redis Cache.
         * @return the next stage of Redis Cache with Premium SKU definition.
         */
        Update withPatchSchedule(ScheduleEntry scheduleEntry);

        /**
         * Adds Patch schedule to the current Premium Cluster Cache.
         *
         * @param scheduleEntry List of patch schedule entries for Premium Redis Cache.
         * @return the next stage of Redis Cache with Premium SKU definition.
         */
        Update withPatchSchedule(List<ScheduleEntry> scheduleEntry);

        /**
         * Removes all Patch schedules from the current Premium Cluster Cache.
         *
         * @return the next stage of Redis Cache with Premium SKU definition.
         */
        Update withoutPatchSchedule();

        /**
         * Creates or updates Redis cache firewall rule with range of IP addresses permitted to connect to the cache.
         *
         * @param name name of the rule.
         * @param lowestIp lowest IP address included in the range.
         * @param highestIp highest IP address included in the range.
         * @return the next stage of Redis Cache update.
         */
        Update withFirewallRule(String name, String lowestIp, String highestIp);

        /**
         * Creates or updates Redis cache firewall rule with range of IP addresses permitted to connect to the cache.
         *
         * @param rule firewall rule that specifies name, lowest and highest IP address included in the range of
         *     permitted IP addresses.
         * @return the next stage of Redis Cache update.
         */
        Update withFirewallRule(RedisFirewallRule rule);

        /**
         * Deletes a single firewall rule in the current Redis cache instance.
         *
         * @param name name of the rule.
         * @return the next stage of Redis Cache update.
         */
        Update withoutFirewallRule(String name);

        /**
         * Requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2').
         *
         * @param tlsVersion minimum TLS version.
         * @return the next stage of Redis Cache definition.
         */
        Update withMinimumTlsVersion(TlsVersion tlsVersion);

        /**
         * Removes the requirement for clients minimum TLS version.
         *
         * @return the next stage of Redis Cache definition.
         */
        Update withoutMinimumTlsVersion();

        /**
         * Update the Redis version.
         * @param redisVersion the redisVersion value to set
         * @return the next stage of Redis Cache definition.
         */
        Update withRedisVersion(RedisVersion redisVersion);
    }

    /**
     * major version of redis
     * for version 4.x.x, use V4
     * for version 6.x.x, use V6
     */
    enum RedisVersion {
        /**
         * version 6.x.x
         */
        V6("6"),
        /**
         * version 4.x.x
         * @deprecated Because Redis version 4 is no longer supported by the open source community,
         *             it will be retired from Azure Cache for Redis.
         */
        @Deprecated
        V4("4");

        private final String value;

        RedisVersion(String value) {
            this.value = value;
        }

        /**
         * Gets the string representation of the version.
         *
         * @return The string representation of the version.
         */
        public String getValue() {
            return value;
        }
    }
}
