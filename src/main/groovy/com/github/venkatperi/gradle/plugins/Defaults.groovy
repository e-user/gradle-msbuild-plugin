package com.github.venkatperi.gradle.plugins

/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Venkat Peri 
 */
class Defaults {
    def static baseIncDirs = ['$(VCInstallDir)include', '$(VCInstallDir)atlmfc/include', '$(WindowsSdkDir)include', '$(FrameworkSDKDir)/include']
    def static baseLibDirs = ['$(VCInstallDir)lib', '$(VCInstallDir)atlmfc/lib', '$(WindowsSdkDir)lib', '$(FrameworkSDKDir)/lib']

    def static defines = ['WIN32', '_WINDOWS', '%(PreprocessorDefinitions)']
    def static debugDefines = ['_DEBUG']
    def static releaseDefines = ['NDEBUG']
    def static winDllDefines = ['_USRDLL', 'WIN32DLL_EXPORTS']
    def static winLibDefines = ['_LIB']

    def static libs = ['kernel32.lib', 'user32.lib', 'gdi32.lib', 'winspool.lib', 'comdlg32.lib', 'advapi32.lib', 'shell32.lib',
            'ole32.lib', 'oleaut32.lib', 'uuid.lib', 'odbc32.lib', 'odbccp32.lib', '%(AdditionalDependencies)']

}
