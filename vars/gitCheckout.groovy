def call(Map stageParams){

    checkout([
            $class: 'GitSCMpoll',
            branches: [[name: stageParams.branch]],
            userRemoteConfigs: [[url: stageParams.url]]
    ])
}