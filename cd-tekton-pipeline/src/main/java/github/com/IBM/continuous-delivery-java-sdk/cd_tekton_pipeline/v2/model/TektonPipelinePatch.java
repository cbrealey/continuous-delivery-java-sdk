/*
 * (C) Copyright IBM Corp. 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package github.com/IBM/continuous-delivery-java-sdk.cd_tekton_pipeline.v2.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Request body used to update this pipeline.
 */
public class TektonPipelinePatch extends GenericModel {

  @SerializedName("enable_slack_notifications")
  protected Boolean enableSlackNotifications;
  @SerializedName("enable_partial_cloning")
  protected Boolean enablePartialCloning;
  protected WorkerWithId worker;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enableSlackNotifications;
    private Boolean enablePartialCloning;
    private WorkerWithId worker;

    private Builder(TektonPipelinePatch tektonPipelinePatch) {
      this.enableSlackNotifications = tektonPipelinePatch.enableSlackNotifications;
      this.enablePartialCloning = tektonPipelinePatch.enablePartialCloning;
      this.worker = tektonPipelinePatch.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TektonPipelinePatch.
     *
     * @return the new TektonPipelinePatch instance
     */
    public TektonPipelinePatch build() {
      return new TektonPipelinePatch(this);
    }

    /**
     * Set the enableSlackNotifications.
     *
     * @param enableSlackNotifications the enableSlackNotifications
     * @return the TektonPipelinePatch builder
     */
    public Builder enableSlackNotifications(Boolean enableSlackNotifications) {
      this.enableSlackNotifications = enableSlackNotifications;
      return this;
    }

    /**
     * Set the enablePartialCloning.
     *
     * @param enablePartialCloning the enablePartialCloning
     * @return the TektonPipelinePatch builder
     */
    public Builder enablePartialCloning(Boolean enablePartialCloning) {
      this.enablePartialCloning = enablePartialCloning;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the TektonPipelinePatch builder
     */
    public Builder worker(WorkerWithId worker) {
      this.worker = worker;
      return this;
    }
  }

  protected TektonPipelinePatch() { }

  protected TektonPipelinePatch(Builder builder) {
    enableSlackNotifications = builder.enableSlackNotifications;
    enablePartialCloning = builder.enablePartialCloning;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a TektonPipelinePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enableSlackNotifications.
   *
   * Flag whether to enable slack notifications for this pipeline. When enabled, pipeline run events will be published
   * on all slack integration specified channels in the enclosing toolchain.
   *
   * @return the enableSlackNotifications
   */
  public Boolean enableSlackNotifications() {
    return enableSlackNotifications;
  }

  /**
   * Gets the enablePartialCloning.
   *
   * Flag whether to enable partial cloning for this pipeline. When partial clone is enabled, only the files contained
   * within the paths specified in definition repositories will be read and cloned. This means symbolic links may not
   * work.
   *
   * @return the enablePartialCloning
   */
  public Boolean enablePartialCloning() {
    return enablePartialCloning;
  }

  /**
   * Gets the worker.
   *
   * Worker object containing worker ID only. If omitted the IBM Managed shared workers are used by default.
   *
   * @return the worker
   */
  public WorkerWithId worker() {
    return worker;
  }

  /**
   * Construct a JSON merge-patch from the TektonPipelinePatch.
   *
   * Note that properties of the TektonPipelinePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the TektonPipelinePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}
